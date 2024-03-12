package edu.ssc.hrs.rest;

import edu.ssc.hrs.entity.service.ConferenceService;
import edu.ssc.hrs.entity.service.CustomerService;
import edu.ssc.hrs.entity.service.DeliveryService;
import edu.ssc.hrs.entity.service.DesignInstallationService;
import edu.ssc.hrs.entity.service.InventoryService;
import edu.ssc.hrs.entity.service.LocationService;
import edu.ssc.hrs.entity.service.OrderService;
import edu.ssc.hrs.entity.service.SupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final InventoryService inventoryService;
    private final OrderService orderService;
    private final CustomerService customerService;
    private final SupplierService supplierService;
    private final ConferenceService conferenceService;
    private final DeliveryService deliveryService;
    private final DesignInstallationService designInstallationService;
    private final LocationService locationService;

    public EmployeeController(InventoryService inventoryService, OrderService orderService,
                              CustomerService customerService, SupplierService supplierService,
                              ConferenceService conferenceService, DeliveryService deliveryService,
                              DesignInstallationService designInstallationService,
                              LocationService locationService) {
        this.inventoryService = inventoryService;
        this.orderService = orderService;
        this.customerService = customerService;
        this.supplierService = supplierService;
        this.conferenceService = conferenceService;
        this.deliveryService = deliveryService;
        this.designInstallationService = designInstallationService;
        this.locationService = locationService;
    }

    @GetMapping(value = "")
    public String index(Model model) {
        return "employee-panel";
    }

    @GetMapping("/inventory")
    public String manageInventory(Model model) {
        model.addAttribute("inventoryList", inventoryService.findAll());
        return "inventory-management";
    }

    @GetMapping("/orders")
    public String manageOrders(Model model) {
        model.addAttribute("orderList", orderService.findAll());
        return "order-management";
    }

    @GetMapping("/customers")
    public String manageCustomers(Model model) {
        model.addAttribute("customerList", customerService.findAll());
        return "customer-management";
    }

    @GetMapping("/suppliers")
    public String manageSuppliers(Model model) {
        model.addAttribute("supplierList", supplierService.findAll());
        return "supplier-management";
    }

    @GetMapping("/conferences")
    public String manageConferences(Model model) {
        model.addAttribute("conferenceList", conferenceService.findAll());
        return "conference-management";
    }

    @GetMapping("/deliveries")
    public String manageDeliveries(Model model) {
        model.addAttribute("deliveryList", deliveryService.findAll());
        return "delivery-management";
    }

    @GetMapping("/designInstallationServices")
    public String manageDesignInstallationServices(Model model) {
        model.addAttribute("serviceList", designInstallationService.findAll());
        return "service-management";
    }

    @GetMapping("/locations")
    public String manageLocations(Model model) {
        model.addAttribute("locationList", locationService.findAll());
        return "location-management";
    }

    @PostMapping("/orders/updateStatus")
    public String updateOrderStatus(
            @RequestParam("orderId") Long orderId,
            @RequestParam("newStatus") String newStatus
    ) {
        orderService.updateOrderStatus(orderId, newStatus);
        return "redirect:/employee/orders";
    }

}
