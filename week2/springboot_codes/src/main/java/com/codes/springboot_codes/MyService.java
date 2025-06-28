package com.codes.springboot_codes;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();  // This is what we're verifying in the test
    }
}
