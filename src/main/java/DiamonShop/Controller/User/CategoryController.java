package DiamonShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Dto.PaginatesDto;
import DiamonShop.Service.User.CategoryServiceImpl;
import DiamonShop.Service.User.PaginateServiceImpl;
@Controller
public class CategoryController extends BaseController {
//	int totalProductsPage=9;
//	@Autowired
//	private CategoryServiceImpl categoryService;
//	@Autowired
//	private PaginateServiceImpl paginateServiceImpl;
//	@RequestMapping(value = "/san-pham/{id}")
//	public ModelAndView Product(@PathVariable String id) {
//		
//		_mvShare.setViewName("user/products/category");
//		
//		int totalData = categoryService.GetAllProductsByID(Integer.parseInt(id)).size();
//		PaginatesDto paginateInfo = paginateServiceImpl.GetInfoPaginates(totalData, totalProductsPage, 1);
//		_mvShare.addObject("paginateInfo",categoryService.GetAllProductsByID(Integer.parseInt(id)));
//		_mvShare.addObject("idcategory",id);
//		_mvShare.addObject("paginateInfo", paginateInfo);
//		_mvShare.addObject("productsPaginate",categoryService.GetDataProductsPaginate(Integer.parseInt(id),paginateInfo.getStart(), totalProductsPage));
//		return _mvShare;
//	}
//	
//	@RequestMapping(value = "/san-pham/{id}/{currentPage}")
//	public ModelAndView Product(@PathVariable String id,@PathVariable String currentPage) {
//		
//		_mvShare.setViewName("user/products/category");
//		
//		int totalData = categoryService.GetAllProductsByID(Integer.parseInt(id)).size();
//		PaginatesDto paginateInfo = paginateServiceImpl.GetInfoPaginates(totalData,  totalProductsPage, Integer.parseInt(currentPage));
//		_mvShare.addObject("paginateInfo",categoryService.GetAllProductsByID(Integer.parseInt(id)));
//		_mvShare.addObject("idcategory",id);
//		_mvShare.addObject("paginateInfo", paginateInfo);
//		_mvShare.addObject("productsPaginate",categoryService.GetDataProductsPaginate(Integer.parseInt(id) ,paginateInfo.getStart(), totalProductsPage));
//		return _mvShare;
//	}
}
