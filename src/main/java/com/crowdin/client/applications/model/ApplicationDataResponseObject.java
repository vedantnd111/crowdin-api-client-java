package com.crowdin.client.applications.model;

import lombok.Data;

import java.util.Map;

@Data
public class ApplicationDataResponseObject {
    private Map<String, Object> data;
}
