/*
 * SecurityQuestionsVO.java
 */
package com.spring.saas.model;

/**
 * The Class SecurityQuestionsVO.
 *
 * @author yaror2
 */
public class SecurityQuestionsVO {

	/** The question_text. */
	private String question_text;

	/** The question_order. */
	private String question_order;

	/** The question_id. */
	private int question_id;

	/** The answer. */
	private String answer;

	/**
	 * Gets the question_text.
	 *
	 * @return the question_text
	 */
	public String getQuestion_text() {
		return this.question_text;
	}

	/**
	 * Sets the question_text.
	 *
	 * @param question_text the new question_text
	 */
	public void setQuestion_text(String question_text) {
		this.question_text = question_text;
	}

	/**
	 * Gets the question_order.
	 *
	 * @return the question_order
	 */
	public String getQuestion_order() {
		return this.question_order;
	}

	/**
	 * Sets the question_order.
	 *
	 * @param question_order the new question_order
	 */
	public void setQuestion_order(String question_order) {
		this.question_order = question_order;
	}

	/**
	 * Gets the answer.
	 *
	 * @return the answer
	 */
	public String getAnswer() {
		return this.answer;
	}

	/**
	 * Sets the answer.
	 *
	 * @param answer the new answer
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * Sets the question_id.
	 *
	 * @param question_id the new question_id
	 */
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	/**
	 * Gets the question_id.
	 *
	 * @return the question_id
	 */
	public int getQuestion_id() {
		return this.question_id;
	}

}
