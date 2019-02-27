
package ilbunilcho.mybatis.generator.plugins;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

public class CommentGeneratorPlugin extends DefaultCommentGenerator {
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        field.addJavaDocLine("/**");
        field.addJavaDocLine(" * <pre>");

        String remarks = introspectedColumn.getRemarks();
        if (StringUtility.stringHasValue(remarks)) {
            String[] remarkLines = remarks.split(System.getProperty("line.separator"));
            for (String remarkLine : remarkLines) {
                field.addJavaDocLine(" * " + remarkLine);
            }
            field.addJavaDocLine(" *");
        }

        field.addJavaDocLine(formatDocLine("Table", introspectedTable.getFullyQualifiedTable().toString()));
        field.addJavaDocLine(formatDocLine("Column", introspectedColumn.getActualColumnName()));
        field.addJavaDocLine(formatDocLine("Type", introspectedColumn.getJdbcTypeName() + " (" + introspectedColumn.getLength() + ")"));

        String defaultValue = introspectedColumn.getDefaultValue();
        if (StringUtility.stringHasValue(defaultValue)) {
            field.addJavaDocLine(formatDocLine("Default", defaultValue));
        }

        String typeHandler = introspectedColumn.getTypeHandler();
        if (StringUtility.stringHasValue(typeHandler)) {
            field.addJavaDocLine(formatDocLine("TypeHandler", typeHandler));
        }

        field.addJavaDocLine(" * </pre>");

        if (StringUtility.stringHasValue(typeHandler)) {
            field.addJavaDocLine(" * @see " + typeHandler);
        }

        this.addJavadocTag(field, false);

        field.addJavaDocLine(" */");
    }

    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * <pre>");

        String remarks = introspectedTable.getRemarks();
        if (StringUtility.stringHasValue(remarks)) {
            String[] remarkLines = remarks.split(System.getProperty("line.separator"));
            for (String remarkLine : remarkLines) {
                topLevelClass.addJavaDocLine(" * " + remarkLine);
            }
            topLevelClass.addJavaDocLine(" *");
        }

        topLevelClass.addJavaDocLine(formatDocLine("Table", introspectedTable.getFullyQualifiedTable().toString()));

        String alias = introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime();
        if (StringUtility.stringHasValue(alias) && !alias.equalsIgnoreCase(introspectedTable.getFullyQualifiedTableNameAtRuntime())) {
            topLevelClass.addJavaDocLine(formatDocLine("Alias", alias));
        }

        topLevelClass.addJavaDocLine(" * </pre>");

        this.addJavadocTag(topLevelClass, false);

        topLevelClass.addJavaDocLine(" */");
    }

    private String formatDocLine(String key, String value) {
        return String.format(" * %-12s : %s", key, value);
    }
}
