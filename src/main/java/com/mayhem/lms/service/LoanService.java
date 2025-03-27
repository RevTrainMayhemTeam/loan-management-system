package com.mayhem.lms.service;

import com.mayhem.lms.dto.CreateLoanDto;
import com.mayhem.lms.dto.GetLoanByUserIdDto;
import com.mayhem.lms.dto.GetLoanDto;
import com.mayhem.lms.model.Loan;

import java.util.List;

public interface LoanService {
    GetLoanDto updateLoan(Long id, Loan loan);
    Loan createLoan(CreateLoanDto loan);
//    GetLoanByUserIdDto getLoanByUserId(Long userId);
    List<GetLoanDto> getLoanByUserId(Long userId);
//    GetLoanDto approveLoan(Long loanId, Loan loan);

    GetLoanDto approveOrRejectLoan(Long loanId, Long statusId);
}