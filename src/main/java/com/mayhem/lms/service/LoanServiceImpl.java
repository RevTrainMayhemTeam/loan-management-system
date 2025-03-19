package com.mayhem.lms.service;

import com.mayhem.lms.repository.LoanRepository;
import org.springframework.stereotype.Service;

@Service
public class LoanServiceImpl implements LoanService{

    private final LoanRepository loanRepository;

    public LoanServiceImpl(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @Override
    public boolean deleteLoan(Long loanId){
        return loanRepository.findById(loanId).map(loan -> {
            loanRepository.delete(loan);
            return true;
        }).orElse(false);
    }
}
