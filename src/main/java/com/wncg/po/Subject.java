package com.wncg.po;

public class Subject {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.subject_id
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    private Integer subjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.subject
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    private String subject;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.subject_id
     *
     * @return the value of subject.subject_id
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.subject_id
     *
     * @param subjectId the value for subject.subject_id
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.subject
     *
     * @return the value of subject.subject
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.subject
     *
     * @param subject the value for subject.subject
     *
     * @mbggenerated Tue Mar 14 14:26:49 CST 2017
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
}