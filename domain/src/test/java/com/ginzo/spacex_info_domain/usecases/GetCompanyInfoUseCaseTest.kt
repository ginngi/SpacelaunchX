package com.ginzo.spacex_info_domain.usecases

import com.ginzo.spacex_info_domain.repository.CompanyRepository
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.verifyNoMoreInteractions
import org.junit.After
import org.junit.Test

class GetCompanyInfoUseCaseTest {

  private val repository: CompanyRepository = mock()

  private val useCase = GetCompanyInfoUseCase(repository)

  @After
  fun tearDown() {
    verifyNoMoreInteractions(repository)
  }

  @Test
  fun getCompanyInfo() {
    useCase.companyInfo()

    verify(repository).getCompanyInfo()
  }
}
