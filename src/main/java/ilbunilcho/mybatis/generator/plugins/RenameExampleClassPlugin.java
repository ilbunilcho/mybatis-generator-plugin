
package ilbunilcho.mybatis.generator.plugins;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.List;

public class RenameExampleClassPlugin extends PluginAdapter {
    private static final String KEYWORD_1 = "example";
    private static final String KEYWORD_2 = "Example";

    @Override
    public boolean validate(List<String> warnings) {
        boolean valid = StringUtility.stringHasValue("example") || StringUtility.stringHasValue("Example");

        if (!valid) {
            if (!StringUtility.stringHasValue(KEYWORD_1)) {
                warnings.add(KEYWORD_1 + " not found");
            }

            if (!StringUtility.stringHasValue(KEYWORD_2)) {
                warnings.add(KEYWORD_2 + " not found");
            }
        }

        return valid;
    }

    public void initialized(IntrospectedTable introspectedTable) {
        introspectedTable.setCountByExampleStatementId(rename(introspectedTable.getCountByExampleStatementId()));

        introspectedTable.setSelectByExampleStatementId(rename(introspectedTable.getSelectByExampleStatementId()));
        introspectedTable.setSelectByExampleWithBLOBsStatementId(rename(introspectedTable.getSelectByExampleWithBLOBsStatementId()));

        introspectedTable.setUpdateByExampleSelectiveStatementId(rename(introspectedTable.getUpdateByExampleSelectiveStatementId()));
        introspectedTable.setUpdateByExampleStatementId(rename(introspectedTable.getUpdateByExampleStatementId()));
        introspectedTable.setUpdateByExampleWithBLOBsStatementId(rename(introspectedTable.getUpdateByExampleWithBLOBsStatementId()));

        introspectedTable.setDeleteByExampleStatementId(rename(introspectedTable.getDeleteByExampleStatementId()));

        introspectedTable.setExampleType(rename(introspectedTable.getExampleType()));

        introspectedTable.setExampleWhereClauseId(rename(introspectedTable.getExampleWhereClauseId()));

        introspectedTable.setMyBatis3UpdateByExampleWhereClauseId(rename(introspectedTable.getMyBatis3UpdateByExampleWhereClauseId()));

    }

    private static String rename(String old) {
        if (old.contains("example")) {
            return old.replaceAll("example", "searchCriteria");
        } else if (old.contains("Example")) {
            return old.replaceAll("Example", "SearchCriteria");
        } else {
            return old;
        }
    }
}
