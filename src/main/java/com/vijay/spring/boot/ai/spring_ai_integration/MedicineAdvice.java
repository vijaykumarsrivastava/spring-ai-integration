package com.vijay.spring.boot.ai.spring_ai_integration;

/**
 * Simple immutable DTO representing medicine advice for a patient.
 */
public record MedicineAdvice(
        String patientId,
        String medicineName,
        String dosage,
        String frequency,
        String notes
) {
}
