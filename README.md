# mybatis-generator-plugin

Feel free to use this plugins at your work!

## Plugin List
- RenameExampleClass (XyzExample to XyzSearchCriteria)
- RenameExampleMethod
- Comment Generator
  * table name
  * column name
  * default value
  * data type
  * typehandler
  * alias

## BUILD PLUGIN

* build jar
```
mvn clean package
```

* copy jar
```
target/mybatis-generator-plugin-xxx.jar to {project_root}/lib/
```

## SAMPLE TEST

* run mybatis plugin task
```
mvn mybatis-generator:generate
```

this output will overwrite files in test/java and test/resources

* check your model/mapper
  * model: test/java/sample/model
  * mapper: test/java/sample/dao
  * mapper xml: test/resources/sample/mapper

## SAMPLE USAGE

* query with mapper

```
@Autowired
AlbumsMapper albumsMapper;

Albums album = albumsMapper.selectByPrimaryKey(1);
```

* query with searchCriteria

```
@Autowired
AlbumsMapper albumsMapper;

AlbumsSearchCriteria searchCriteria = new AlbumsSearchCriteria();
  searchCriteria.createCriteria()
    .andTitleEqualTo("Facelift");
  searchCriteria.setOrderByClause("Title ASC");

List<Albums> albumList = albumsMapper.selectBySearchCriteria(searchCriteria);
```

# LICENSE
GPL-3.0-or-later