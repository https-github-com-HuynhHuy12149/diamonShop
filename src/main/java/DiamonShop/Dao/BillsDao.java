package DiamonShop.Dao;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.BillDetail;
import DiamonShop.Entity.Bills;

@Repository
public class BillsDao extends BaseDao {
//	public int AddBills(Bills bill) {
//		StringBuffer sql = new StringBuffer();
//		sql.append("INSERT INTO bills");
//		sql.append("(");
//		sql.append(" `user`, `phone`,`display_name`,`address`,`total`,`quanty`,`note`");
//		sql.append(")");
//		sql.append("VALUES");
//		sql.append("(");
//		sql.append(" '"+bill.getUser()+"' , ");
//		sql.append(" '"+bill.getPhone()+"' , ");
//		sql.append(" '"+bill.getDisplay_name()+"' , ");
//		sql.append(" '"+bill.getAddress()+"' , ");
//		sql.append(" '"+bill.getTotal()+"' , ");
//		sql.append(" '"+bill.getQuanty()+"' , ");
//		sql.append(" '"+bill.getNote()+"' ");
//		sql.append(")");
//		int insert = _jdbcTemplate.update(sql.toString());
//		return insert;
//	}
//	
//	public long GetIDLastBills() {
//		StringBuffer sql = new StringBuffer();
//		sql.append("Select MAX(id) from bills;");
//		long id = _jdbcTemplate.queryForObject(sql.toString(),new Object[] {}, Long.class);
//		return id;
//	}
//	
//	public int AddBillsDetail(BillDetail billDetail) {
//		StringBuffer sql = new StringBuffer();
//		sql.append("INSERT INTO billdetail");
//		sql.append("(");
//		sql.append(" id_product, ");
//		sql.append(" id_bills, ");
//		sql.append(" quanty, ");
//		sql.append(" total ");
//		sql.append(")");
//		sql.append("VALUES");
//		sql.append("(");
//		sql.append(" '"+billDetail.getId_product()+"' , ");
//		sql.append(" '"+billDetail.getId_bills()+"' , ");
//		sql.append(" '"+billDetail.getQuanty()+"' , ");
//		sql.append(" '"+billDetail.getTotal()+"' ");
//		sql.append(")");
//		int insert = _jdbcTemplate.update(sql.toString());
//		return insert;
//	}
//	
	

}