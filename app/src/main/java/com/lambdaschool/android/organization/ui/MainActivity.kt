package com.lambdaschool.android.organization.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.android.organization.R
import com.lambdaschool.android.organization.model.ProductClass
import com.lambdaschool.android.organization.util.DateUtils
import com.lambdaschool.android.organization.util.TextUtils
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Product Details"
        setContentView(R.layout.activity_main)
        displayProductDetails()
    }

    private fun displayProductDetails() {
        // todo: Instantiate a Product, set its characteristics, and
        val product = ProductClass("whip", "Indiana Jones style whip", 3.50, 0.06, 0.25)
        // set each of the fields on the corresponding TextViews from the layout
        // use the appropriate Util methods for formatting the fields
        productName.text = product.productName
        productDescription.text = product.productDescription
        productPrice.text = TextUtils.formatCurrency(product.productPrice)
        productTax.text = TextUtils.formatCurrency((product.productTax * product.productPrice))
        totalProductPrice.text = TextUtils.formatCurrency(product.productPrice + (product.productTax * product.productPrice))
        productDiscount.text = TextUtils.formatPercent(product.productDiscount)
        orderDate.text = DateUtils.formatDate(Date())
    }
}
