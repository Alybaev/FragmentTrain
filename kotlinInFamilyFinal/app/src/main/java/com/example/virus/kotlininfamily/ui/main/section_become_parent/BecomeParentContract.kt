package com.example.virus.kotlininfamily.ui.main.section_become_parent

import android.content.Context
import com.example.virus.kotlininfamily.models.Categories
import com.example.virus.kotlininfamily.models.DocumentStatus
import com.example.virus.kotlininfamily.utils.IProgressBar
import com.example.virus.kotlininfamily.utils.IResult
import com.example.virus.kotlininfamily.utils.IStatusResult
import java.util.*
import kotlin.collections.ArrayList

interface BecomeParentContract {
    interface View: IProgressBar, IResult<List<Categories>>,IStatusResult<DocumentStatus>
    interface Presenter{
        fun getMainMenuCategoryArticles(id:Int)
        fun checkStatus(context: Context)


    }




    }
