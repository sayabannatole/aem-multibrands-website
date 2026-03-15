package com.example.aem.models;

import org.apache.sling.models.api.Model;
import org.apache.sling.models.api.injectors.ValueMapValue;

import javax.inject.Inject;

@Model(adaptables = Resource.class)
public class BrandConfig {

    @Inject
    @ValueMapValue
    private String brandName;

    @Inject
    @ValueMapValue
    private String brandId;

    @Inject
    @ValueMapValue
    private String primaryColor;

    @Inject
    @ValueMapValue
    private String secondaryColor;

    @Inject
    @ValueMapValue
    private String accentColor;

    @Inject
    @ValueMapValue
    private String logoPath;

    public String getBrandName() {
        return brandName;
    }

    public String getBrandId() {
        return brandId;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public String getAccentColor() {
        return accentColor;
    }

    public String getLogoPath() {
        return logoPath;
    }
}