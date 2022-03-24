package com.ankitsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityAppNavigationBinding
import com.ankitsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.ankitsapplication.app.modules.incomingcallinthemiddleofanothercall.ui.IncomingCallInTheMiddleOfAnotherCallActivity
import com.ankitsapplication.app.modules.incomingcallnotification.ui.IncomingCallNotificationActivity
import com.ankitsapplication.app.modules.incomingcallnotificationmorethanoneprofile.ui.IncomingCallNotificationMoreThanOneProfileActivity
import com.ankitsapplication.app.modules.incominggroupcallnotification.ui.IncomingGroupCallNotificationActivity
import com.ankitsapplication.app.modules.telegramxmainscreen.ui.TelegramXMainScreenActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linear05IncomingGroupCallNotification.setOnClickListener {
      val destIntent = IncomingGroupCallNotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear06IncomingCallInTheMiddleOfAnotherCall.setOnClickListener {
      val destIntent = IncomingCallInTheMiddleOfAnotherCallActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear01TelegramXMainScreen.setOnClickListener {
      val destIntent = TelegramXMainScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear04IncomingCallNotificationMoreThanOneProfile.setOnClickListener {
      val destIntent = IncomingCallNotificationMoreThanOneProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear03IncomingCallNotification.setOnClickListener {
      val destIntent = IncomingCallNotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
