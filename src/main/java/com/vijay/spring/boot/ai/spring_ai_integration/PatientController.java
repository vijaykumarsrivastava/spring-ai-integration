package com.vijay.spring.boot.ai.spring_ai_integration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller exposing patient-related APIs.
 */
@RestController
@RequestMapping(path = "/api/patient", produces = MediaType.APPLICATION_JSON_VALUE)
public class PatientController {

    /**
     * GET /api/patient/medicine-advice?patientId={id}
     * Returns a sample MedicineAdvice record for the requested patientId.
     */
    @GetMapping("/medicine-advice")
    public MedicineAdvice getMedicineAdvice(@RequestParam(name = "patientId", required = false) String patientId) {

        String pid = (patientId == null || patientId.isBlank()) ? "unknown" : patientId;

        MedicineAdvice advice = new MedicineAdvice(
                pid,
                "Amoxicillin",
                "500 mg",
                "Three times a day",
                "Take after meals for 7 days"
        );

        return advice;
    }

}
