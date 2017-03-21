package com.wncg.po;

import java.util.Date;

public class BorrowRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_record.borrow_record_id
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    private Integer borrowRecordId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_record.user_id
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_record.book_id
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    private Integer bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_record.isbn
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    private String isbn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_record.borrow_date
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    private Date borrowDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_record.return_date
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    private Date returnDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_record.borrow_state
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    private Integer borrowState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_record.borrow_record_id
     *
     * @return the value of borrow_record.borrow_record_id
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public Integer getBorrowRecordId() {
        return borrowRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_record.borrow_record_id
     *
     * @param borrowRecordId the value for borrow_record.borrow_record_id
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public void setBorrowRecordId(Integer borrowRecordId) {
        this.borrowRecordId = borrowRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_record.user_id
     *
     * @return the value of borrow_record.user_id
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_record.user_id
     *
     * @param userId the value for borrow_record.user_id
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_record.book_id
     *
     * @return the value of borrow_record.book_id
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_record.book_id
     *
     * @param bookId the value for borrow_record.book_id
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_record.isbn
     *
     * @return the value of borrow_record.isbn
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_record.isbn
     *
     * @param isbn the value for borrow_record.isbn
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_record.borrow_date
     *
     * @return the value of borrow_record.borrow_date
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public Date getBorrowDate() {
        return borrowDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_record.borrow_date
     *
     * @param borrowDate the value for borrow_record.borrow_date
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_record.return_date
     *
     * @return the value of borrow_record.return_date
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public Date getReturnDate() {
        return returnDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_record.return_date
     *
     * @param returnDate the value for borrow_record.return_date
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_record.borrow_state
     *
     * @return the value of borrow_record.borrow_state
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public Integer getBorrowState() {
        return borrowState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_record.borrow_state
     *
     * @param borrowState the value for borrow_record.borrow_state
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public void setBorrowState(Integer borrowState) {
        this.borrowState = borrowState;
    }
}