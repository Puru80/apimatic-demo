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
 * This is a model class for FeatureRequest type.
 */
public class FeatureRequest {
    private String featureName;
    private String status;

    /**
     * Default constructor.
     */
    public FeatureRequest() {
    }

    /**
     * Initialization constructor.
     * @param  featureName  String value for featureName.
     * @param  status  String value for status.
     */
    public FeatureRequest(
            String featureName,
            String status) {
        this.featureName = featureName;
        this.status = status;
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
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Converts this FeatureRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FeatureRequest [" + "featureName=" + featureName + ", status=" + status + "]";
    }

    /**
     * Builds a new {@link FeatureRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FeatureRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .featureName(getFeatureName())
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link FeatureRequest}.
     */
    public static class Builder {
        private String featureName;
        private String status;



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
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link FeatureRequest} object using the set fields.
         * @return {@link FeatureRequest}
         */
        public FeatureRequest build() {
            return new FeatureRequest(featureName, status);
        }
    }
}
