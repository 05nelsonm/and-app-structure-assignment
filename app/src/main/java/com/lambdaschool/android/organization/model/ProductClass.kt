package com.lambdaschool.android.organization.model

class ProductClass (
    val productName: String,
    val productDescription: String,
    val productPrice: Double,
    val productTax: Double = 0.06,
    val productDiscount: Double = 0.10
)