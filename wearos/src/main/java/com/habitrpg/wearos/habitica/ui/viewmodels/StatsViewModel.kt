package com.habitrpg.wearos.habitica.ui.viewmodels

import com.habitrpg.wearos.habitica.data.repositories.UserRepository
import com.habitrpg.wearos.habitica.util.ExceptionHandlerBuilder
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatsViewModel @Inject constructor(userRepository: UserRepository,
    exceptionBuilder: ExceptionHandlerBuilder
) : BaseViewModel(userRepository, exceptionBuilder) {

}