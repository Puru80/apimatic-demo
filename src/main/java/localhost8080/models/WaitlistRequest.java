/*
 * WaitlistAPIContractsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost8080.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for WaitlistRequest type.
 */
public class WaitlistRequest {
    private String customerNumber;
    private String featureName;

    /**
     * Default constructor.
     */
    public WaitlistRequest() {
    }

    /**
     * Initialization constructor.
     * @param  customerNumber  String value for customerNumber.
     * @param  featureName  String value for featureName.
     */
    public WaitlistRequest(
            String customerNumber,
            String featureName) {
        this.customerNumber = customerNumber;
        this.featureName = featureName;
    }

    /**
     * Getter for CustomerNumber.
     * @return Returns the String
     */
    @JsonGetter("customerNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Setter for CustomerNumber.
     * @param customerNumber Value for String
     */
    @JsonSetter("customerNumber")
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    /**
     * Getter for FeatureName.
     * @return Returns the String
     */
    @JsonGetter("featureName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFeatureName() {
        return featureName;
    }

    /**
     * Setter for FeatureName.
     * @param featureName Value for String
     */
    @JsonSetter("featureName")
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * Converts this WaitlistRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WaitlistRequest [" + "customerNumber=" + customerNumber + ", featureName="
                + featureName + "]";
    }

    /**
     * Builds a new {@link WaitlistRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WaitlistRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customerNumber(getCustomerNumber())
                .featureName(getFeatureName());
        return builder;
    }

    /**
     * Class to build instances of {@link WaitlistRequest}.
     */
    public static class Builder {
        private String customerNumber;
        private String featureName;



        /**
         * Setter for customerNumber.
         * @param  customerNumber  String value for customerNumber.
         * @return Builder
         */
        public Builder customerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }

        /**
         * Setter for featureName.
         * @param  featureName  String value for featureName.
         * @return Builder
         */
        public Builder featureName(String featureName) {
            this.featureName = featureName;
            return this;
        }

        /**
         * Builds a new {@link WaitlistRequest} object using the set fields.
         * @return {@link WaitlistRequest}
         */
        public WaitlistRequest build() {
            return new WaitlistRequest(customerNumber, featureName);
        }
    }
}
