package com.jwtexample.Model;

public class JwtResponse {

    private String jwtToken;
    private String name;

    // Private constructor to enforce use of Builder
    private JwtResponse(Builder builder) {
        this.jwtToken = builder.jwtToken;
        this.name = builder.name;
    }

    // Getters and Setters
    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Static inner Builder class
    public static class Builder {
        private String jwtToken;
        private String name;

        public Builder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public JwtResponse build() {
            return new JwtResponse(this);
        }
    }

    // Optional: Static method to create the builder
    public static Builder builder() {
        return new Builder();
    }
}
