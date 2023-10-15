package com.bank.profile.apiClient;

import com.bank.profile.entity.AccountDetails;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "AccountApiClient", url = "")
public interface AccountApiClient {
    AccountDetails getAccountDetails(Long id);
}
