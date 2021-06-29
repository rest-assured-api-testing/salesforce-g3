/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 *
 * @author Paola Ximena Aguilar Quiñones
 */
package entities;

/**
 * This enum defines valid status for a Case.
 */
public enum CaseEnum {
    NEW("New"),
    WORKING("Working"),
    ESCALATED("Escalated");

    private String status;

    CaseEnum(final String status) {
        this.status = status;
    }

    /**
     * Gets the status according to the Sales force Case.
     *
     * @return the status.
     */
    public String toStatus() {
        return status;
    }
}
