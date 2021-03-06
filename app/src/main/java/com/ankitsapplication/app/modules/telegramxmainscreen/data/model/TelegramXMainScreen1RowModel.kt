package com.ankitsapplication.app.modules.telegramxmainscreen.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class TelegramXMainScreen1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRobertLeeZeme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_robert_lee_zeme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDirector: String? = MyApp.getInstance().resources.getString(R.string.lbl_director)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMaybe: String? = MyApp.getInstance().resources.getString(R.string.lbl_maybe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMay02: String? = MyApp.getInstance().resources.getString(R.string.lbl_may_02)

)
