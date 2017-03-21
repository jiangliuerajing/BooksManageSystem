package com.wncg.dao;

import com.wncg.po.BorrowRecord;
import com.wncg.po.BorrowRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    int countByExample(BorrowRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    int deleteByExample(BorrowRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    int deleteByPrimaryKey(Integer borrowRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    int insert(BorrowRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    int insertSelective(BorrowRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    List<BorrowRecord> selectByExample(BorrowRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    BorrowRecord selectByPrimaryKey(Integer borrowRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    int updateByExampleSelective(@Param("record") BorrowRecord record, @Param("example") BorrowRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    int updateByExample(@Param("record") BorrowRecord record, @Param("example") BorrowRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    int updateByPrimaryKeySelective(BorrowRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    int updateByPrimaryKey(BorrowRecord record);
}