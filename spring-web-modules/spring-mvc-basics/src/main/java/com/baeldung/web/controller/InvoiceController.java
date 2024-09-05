package com.baeldung.web.controller;

import com.baeldung.model.Invoice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class InvoiceController {

    Map<Long, Invoice> invoiceMap = new HashMap<>();

    @ModelAttribute("invoices")
    public void initInvoices() {
        invoiceMap.put(1L, new Invoice(1L, "Luz", 50, 0.05));
        invoiceMap.put(2L, new Invoice(2L, "Agua", 220, 0.05));
        invoiceMap.put(3L, new Invoice(3L, "Gas", 2233, 0.07));
    }

    @RequestMapping(value = "/invoice", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("invoiceHome", "invoice", new Invoice());
    }

    @RequestMapping(value = "/invoice/{Id}", produces = { "application/json", "application/xml" }, method = RequestMethod.GET)
    public @ResponseBody Invoice getInvoiceById(@PathVariable final Long Id) {
        return invoiceMap.get(Id);
    }

    @RequestMapping(value = "/addInvoice", method = RequestMethod.POST)
    public String submit(@ModelAttribute("invoice") final Invoice invoice, final BindingResult result, final ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("id", invoice.getId());
        model.addAttribute("concept", invoice.getConcept());
        model.addAttribute("amount", invoice.getAmount());
        model.addAttribute("percentage", invoice.getPercentage());

        invoiceMap.put(invoice.getId(), invoice);

        return "invoiceView";
    }

    @ModelAttribute
    public void addAttributes(final Model model) {
        model.addAttribute("msg", "¡Bienvenido al sistema de facturas!");
    }
}
