package com.milanogc.accounting.application.account;

import com.milanogc.accounting.application.account.commands.CreateAccountCommand;
import com.milanogc.accounting.domain.account.AccountId;
import com.milanogc.accounting.domain.account.AccountService;

public class CreateAccountCommandHandler {

  private AccountService accountService;

  public CreateAccountCommandHandler(AccountService accountService) {
    super();
    this.accountService = accountService;
  }

  public void handle(CreateAccountCommand command) {
    this.accountService.createAccount(command.name(), command.createdOn(), command.description(),
        new AccountId(command.parentAccountId()));
  }
}
