package sample.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import sample.model.Genres;
import sample.model.GenresSearchCriteria;

@Mapper
public interface GenresMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    long countBySearchCriteria(GenresSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int deleteBySearchCriteria(GenresSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int deleteByPrimaryKey(Integer genreid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int insert(Genres record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int insertSelective(Genres record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    List<Genres> selectBySearchCriteriaWithRowbounds(GenresSearchCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    List<Genres> selectBySearchCriteria(GenresSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    Genres selectByPrimaryKey(Integer genreid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int updateBySearchCriteriaSelective(@Param("record") Genres record, @Param("example") GenresSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int updateBySearchCriteria(@Param("record") Genres record, @Param("example") GenresSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int updateByPrimaryKeySelective(Genres record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int updateByPrimaryKey(Genres record);
}