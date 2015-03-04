package org.anonymus.controller;

import org.anonymus.exception.ShopNotFound;
import org.anonymus.model.Shop;
import org.anonymus.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by antoine on 3/2/2015.
 */
@Controller
@RequestMapping(value = "/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView newShopPage() {
        ModelAndView mav = new ModelAndView("shop/shop-new", "shop", new Shop());
        return mav;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView createNewShop(@ModelAttribute @Valid Shop shop, BindingResult result, final RedirectAttributes redirectAttributes) {
        ModelAndView mav = new ModelAndView();
        String message = "New shop " + shop.getName() + " was successfully created.";
        shopService.create(shop);
        mav.setViewName("redirect:/");
        redirectAttributes.addFlashAttribute("message", message);
        return mav;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView shopListPage() {
        ModelAndView mav = new ModelAndView("shop/shop-list");
        List<Shop> shopList = shopService.findAll();
        mav.addObject("shopList", shopList);
        return mav;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editShopPage(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("shop/shop-edit");
        Shop shop = shopService.findById(id);
        mav.addObject("shop", shop);
        return mav;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public ModelAndView editShop(@ModelAttribute Shop shop, @PathVariable Integer id, BindingResult result, final RedirectAttributes redirectAttributes) throws ShopNotFound {
        ModelAndView mav = new ModelAndView("redirect:/");
        String message = "Shop was successfully updated.";

        shopService.update(shop);
        mav.setViewName("redirect:/");

        redirectAttributes.addFlashAttribute("message", message);

        return mav;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteShop(@PathVariable Integer id, final RedirectAttributes redirectAttributes) throws ShopNotFound {

        ModelAndView mav = new ModelAndView("redirect:/");

        Shop shop = shopService.delete(id);
        String message = "The shop " + shop.getName() + " was successfully deleted.";

        redirectAttributes.addFlashAttribute("message", message);
        return mav;
    }
}
