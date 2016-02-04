package PO.InitPO;

import java.io.Serializable;
import java.util.ArrayList;

import PO.AccountPO;
import PO.GoodsPO;
import PO.UserPO;
import PO.VehiclePO;
import PO.Agency.CenterPO;
import PO.Agency.CityPO;
import PO.Agency.HallPO;
import PO.Agency.WarehousePO;
import PO.Person.CustomerPO;
import PO.Person.StuffPO;
import PO.Receipt.BillPO;
import PO.Receipt.OrderPO;
import PO.Receipt.StockPO;
import PO.Receipt.Transit.Center_ArrivalPO;
import PO.Receipt.Transit.Center_FightPO;
import PO.Receipt.Transit.Center_TrainPO;
import PO.Receipt.Transit.Center_VehiclePO;
import PO.Receipt.Transit.Hall_ArrivalPO;
import PO.Receipt.Transit.Hall_LoadPO;

public class ELSData implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<AccountPO> account=new ArrayList<AccountPO>();
	private ArrayList<GoodsPO> goods=new ArrayList<GoodsPO>();
	private ArrayList<UserPO> user=new ArrayList<UserPO>();
	private ArrayList<VehiclePO> vehicle=new ArrayList<VehiclePO>();
	private ArrayList<CenterPO> center=new ArrayList<CenterPO>();
	private ArrayList<CityPO> city=new ArrayList<CityPO>();
	private ArrayList<HallPO> hall=new ArrayList<HallPO>();
	private ArrayList<WarehousePO> warehouse=new ArrayList<WarehousePO>();
	private ArrayList<CustomerPO> customer=new ArrayList<CustomerPO>();
	private ArrayList<StuffPO> stuff=new ArrayList<StuffPO>();
	private ArrayList<Center_ArrivalPO> center_arrival=new ArrayList<Center_ArrivalPO>();
	private ArrayList<Center_FightPO> center_fight=new ArrayList<Center_FightPO>();
	private ArrayList<Center_TrainPO> center_train=new ArrayList<Center_TrainPO>();
	private ArrayList<Center_VehiclePO> center_vehicle=new ArrayList<Center_VehiclePO>();
	private ArrayList<Hall_ArrivalPO> hall_arrival=new ArrayList<Hall_ArrivalPO>();
	private ArrayList<Hall_LoadPO> hall_load=new ArrayList<Hall_LoadPO>();
	private ArrayList<BillPO> bill=new ArrayList<BillPO>();
	private ArrayList<OrderPO> order=new ArrayList<OrderPO>();
	private ArrayList<StockPO> stock=new ArrayList<StockPO>();



	public ELSData(ArrayList<AccountPO> account, ArrayList<GoodsPO> goods, ArrayList<UserPO> user,
			ArrayList<VehiclePO> vehicle, ArrayList<CenterPO> center, ArrayList<CityPO> city, ArrayList<HallPO> hall,
			ArrayList<WarehousePO> warehouse, ArrayList<CustomerPO> customer, ArrayList<StuffPO> stuff,
			ArrayList<Center_ArrivalPO> center_arrival, ArrayList<Center_FightPO> center_fight,
			ArrayList<Center_TrainPO> center_train, ArrayList<Center_VehiclePO> center_vehicle,
			ArrayList<Hall_ArrivalPO> hall_arrival, ArrayList<Hall_LoadPO> hall_load, ArrayList<BillPO> bill,
			ArrayList<OrderPO> order, ArrayList<StockPO> stock) {
		super();
		this.account = account;
		this.goods = goods;
		this.user = user;
		this.vehicle = vehicle;
		this.center = center;
		this.city = city;
		this.hall = hall;
		this.warehouse = warehouse;
		this.customer = customer;
		this.stuff = stuff;
		this.center_arrival = center_arrival;
		this.center_fight = center_fight;
		this.center_train = center_train;
		this.center_vehicle = center_vehicle;
		this.hall_arrival = hall_arrival;
		this.hall_load = hall_load;
		this.bill = bill;
		this.order = order;
		this.stock = stock;
	}
	public ELSData(){
		super();
	}

	public ArrayList<AccountPO> getAccount() {
		return account;
	}

	public void setAccount(ArrayList<AccountPO> account) {
		this.account = account;
	}

	public ArrayList<GoodsPO> getGoods() {
		return goods;
	}

	public void setGoods(ArrayList<GoodsPO> goods) {
		this.goods = goods;
	}

	public ArrayList<UserPO> getUser() {
		return user;
	}

	public void setUser(ArrayList<UserPO> user) {
		this.user = user;
	}

	public ArrayList<VehiclePO> getVehicle() {
		return vehicle;
	}

	public void setVehicle(ArrayList<VehiclePO> vehicle) {
		this.vehicle = vehicle;
	}

	public ArrayList<CenterPO> getCenter() {
		return center;
	}

	public void setCenter(ArrayList<CenterPO> center) {
		this.center = center;
	}

	public ArrayList<CityPO> getCity() {
		return city;
	}

	public void setCity(ArrayList<CityPO> city) {
		this.city = city;
	}

	public ArrayList<HallPO> getHall() {
		return hall;
	}

	public void setHall(ArrayList<HallPO> hall) {
		this.hall = hall;
	}

	public ArrayList<WarehousePO> getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(ArrayList<WarehousePO> warehouse) {
		this.warehouse = warehouse;
	}

	public ArrayList<CustomerPO> getCustomer() {
		return customer;
	}

	public void setCustomer(ArrayList<CustomerPO> customer) {
		this.customer = customer;
	}

	public ArrayList<StuffPO> getStuff() {
		return stuff;
	}

	public void setStuff(ArrayList<StuffPO> stuff) {
		this.stuff = stuff;
	}

	public ArrayList<Center_ArrivalPO> getCenter_arrival() {
		return center_arrival;
	}

	public void setCenter_arrival(ArrayList<Center_ArrivalPO> center_arrival) {
		this.center_arrival = center_arrival;
	}

	public ArrayList<Center_FightPO> getCenter_fight() {
		return center_fight;
	}

	public void setCenter_fight(ArrayList<Center_FightPO> center_fight) {
		this.center_fight = center_fight;
	}

	public ArrayList<Center_TrainPO> getCenter_train() {
		return center_train;
	}

	public void setCenter_train(ArrayList<Center_TrainPO> center_train) {
		this.center_train = center_train;
	}

	public ArrayList<Center_VehiclePO> getCenter_vehicle() {
		return center_vehicle;
	}

	public void setCenter_vehicle(ArrayList<Center_VehiclePO> center_vehicle) {
		this.center_vehicle = center_vehicle;
	}

	public ArrayList<Hall_ArrivalPO> getHall_arrival() {
		return hall_arrival;
	}

	public void setHall_arrival(ArrayList<Hall_ArrivalPO> hall_arrival) {
		this.hall_arrival = hall_arrival;
	}

	public ArrayList<Hall_LoadPO> getHall_load() {
		return hall_load;
	}

	public void setHall_load(ArrayList<Hall_LoadPO> hall_load) {
		this.hall_load = hall_load;
	}

	public ArrayList<BillPO> getBill() {
		return bill;
	}

	public void setBill(ArrayList<BillPO> bill) {
		this.bill = bill;
	}

	public ArrayList<OrderPO> getOrder() {
		return order;
	}

	public void setOrder(ArrayList<OrderPO> order) {
		this.order = order;
	}

	public ArrayList<StockPO> getStock() {
		return stock;
	}

	public void setStock(ArrayList<StockPO> stock) {
		this.stock = stock;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
