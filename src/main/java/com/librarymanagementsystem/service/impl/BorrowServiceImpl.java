/*package com.librarymanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.librarymanagementsystem.entity.Borrow;
import com.librarymanagementsystem.exception.NotFoundException;
import com.librarymanagementsystem.repository.BorrowRepository;
import com.librarymanagementsystem.service.BorrowService;

@Service
public class BorrowServiceImpl implements BorrowService {

	final BorrowRepository borrowRepository;

	public BorrowServiceImpl(BorrowRepository  borrowRepository) {
		this.borrowRepository = borrowRepository;
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	@Override
	public List<Borrow> findAllBorrows() {
		return borrowRepository.findAll();
	}

	@Override
	public Borrow findBorrowById(Long id) {
		return borrowRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("Borrow not found  with ID %d", id)));
	}

	@Override
	public void createBorrow(Borrow borrow) {
		borrowRepository.save(borrow);
	}

	@Override
	public void updateBorrow(Borrow borrow) {
		borrowRepository.save(borrow);
	}

	@Override
	public void deleteBorrow(Long id) {
		var borrow = borrowRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("Borrow not found  with ID %d", id)));

		borrowRepository.deleteById(borrow.getId());
	}

}*/
