package piotr.oddamwdobrerece.donation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository <Donation, Long> {
}
