package com.aite.mainlibrary.Mainbean;

import com.lzy.basemodule.bean.ErrorBean;

import java.io.Serializable;

public class MoreAdressInormationBean extends ErrorBean implements Serializable {


    /**
     * address_info : {"address_id":"10","member_id":"7","true_name":"南京","area_id":"2134","city_id":"175","area_info":"浙江 杭州市 上城区","address":"数据库","tel_phone":"120","mob_phone":"18614079728","is_default":"0","dlyp_id":"0","province_id":"11"}
     */

    private AddressInfoBean address_info;

    public AddressInfoBean getAddress_info() {
        return address_info;
    }

    public void setAddress_info(AddressInfoBean address_info) {
        this.address_info = address_info;
    }

    public static class AddressInfoBean {
        /**
         * address_id : 10
         * member_id : 7
         * true_name : 南京
         * area_id : 2134
         * city_id : 175
         * area_info : 浙江 杭州市 上城区
         * address : 数据库
         * tel_phone : 120
         * mob_phone : 18614079728
         * is_default : 0
         * dlyp_id : 0
         * province_id : 11
         */

        private String address_id;
        private String member_id;
        private String true_name;
        private String area_id;
        private String city_id;
        private String area_info;
        private String address;
        private String tel_phone;
        private String mob_phone;
        private String is_default;
        private String dlyp_id;
        private String province_id;

        public String getAddress_id() {
            return address_id;
        }

        public void setAddress_id(String address_id) {
            this.address_id = address_id;
        }

        public String getMember_id() {
            return member_id;
        }

        public void setMember_id(String member_id) {
            this.member_id = member_id;
        }

        public String getTrue_name() {
            return true_name;
        }

        public void setTrue_name(String true_name) {
            this.true_name = true_name;
        }

        public String getArea_id() {
            return area_id;
        }

        public void setArea_id(String area_id) {
            this.area_id = area_id;
        }

        public String getCity_id() {
            return city_id;
        }

        public void setCity_id(String city_id) {
            this.city_id = city_id;
        }

        public String getArea_info() {
            return area_info;
        }

        public void setArea_info(String area_info) {
            this.area_info = area_info;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTel_phone() {
            return tel_phone;
        }

        public void setTel_phone(String tel_phone) {
            this.tel_phone = tel_phone;
        }

        public String getMob_phone() {
            return mob_phone;
        }

        public void setMob_phone(String mob_phone) {
            this.mob_phone = mob_phone;
        }

        public String getIs_default() {
            return is_default;
        }

        public void setIs_default(String is_default) {
            this.is_default = is_default;
        }

        public String getDlyp_id() {
            return dlyp_id;
        }

        public void setDlyp_id(String dlyp_id) {
            this.dlyp_id = dlyp_id;
        }

        public String getProvince_id() {
            return province_id;
        }

        public void setProvince_id(String province_id) {
            this.province_id = province_id;
        }
    }
}
