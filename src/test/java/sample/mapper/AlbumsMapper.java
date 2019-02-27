package sample.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import sample.model.Albums;
import sample.model.AlbumsSearchCriteria;

@Mapper
public interface AlbumsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    long countBySearchCriteria(AlbumsSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int deleteBySearchCriteria(AlbumsSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int deleteByPrimaryKey(Integer albumid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int insert(Albums record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int insertSelective(Albums record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    List<Albums> selectBySearchCriteriaWithRowbounds(AlbumsSearchCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    List<Albums> selectBySearchCriteria(AlbumsSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    Albums selectByPrimaryKey(Integer albumid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int updateBySearchCriteriaSelective(@Param("record") Albums record, @Param("example") AlbumsSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int updateBySearchCriteria(@Param("record") Albums record, @Param("example") AlbumsSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int updateByPrimaryKeySelective(Albums record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int updateByPrimaryKey(Albums record);
}