package com.example.aem.services;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface BrandService {

    /**
     * Retrieves the brand configuration for the specified brand.
     *
     * @param brand the brand identifier
     * @return the brand configuration object
     */
    BrandConfig getBrandConfig(String brand);

    /**
     * Gets a list of all available brands.
     *
     * @return a list of brand identifiers
     */
    List<String> getAllAvailableBrands();

    /**
     * Determines the current brand based on the incoming request.
     *
     * @param request the HTTP request
     * @return the identifier of the current brand
     */
    String determineCurrentBrand(HttpServletRequest request);
}