package guru.springframework.msscssm.repository;

import guru.springframework.msscssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: sidna
 * Date: 1/26/2021 6:03 PM
 */

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
