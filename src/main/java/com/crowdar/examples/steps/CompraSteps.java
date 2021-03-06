package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.views.CategoriesView;
import com.crowdar.examples.views.ProductView;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class CompraSteps extends PageSteps {
    @When("el cliente desea comprar (.*)")
    public void elClienteDeseaComprarFadedShortSleeveTShirts(String item) {

        Injector._page(CategoriesView.class).elegirItem(item);

    }

    @And("el cliente ingresa (.*) en cantidad")
    public void elClienteIngresaEnCantidad(String cantidad) {
        Injector._page(ProductView.class).ingresarCantidad(cantidad);
    }
}