package sample.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import sample.model.Customers;
import sample.model.CustomersSearchCriteria;

@Mapper
public interface CustomersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    long countBySearchCriteria(CustomersSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int deleteBySearchCriteria(CustomersSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int deleteByPrimaryKey(Integer customerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int insert(Customers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int insertSelective(Customers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    List<Customers> selectBySearchCriteriaWithRowbounds(CustomersSearchCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    List<Customers> selectBySearchCriteria(CustomersSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    Customers selectByPrimaryKey(Integer customerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int updateBySearchCriteriaSelective(@Param("record") Customers record, @Param("example") CustomersSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int updateBySearchCriteria(@Param("record") Customers record, @Param("example") CustomersSearchCriteria searchCriteria);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int updateByPrimaryKeySelective(Customers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    int updateByPrimaryKey(Customers record);
}