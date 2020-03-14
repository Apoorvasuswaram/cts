package com.cts.start.controller;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import com.cts.start.pojo.Company;
	@RestController
	@CrossOrigin(origins="http://localhost:4200")  
	@RequestMapping(value="/company")
	public class CompanyController {
		@Autowired
		private com.cts.start.dao.CompanyRepository CompanyRepository;

		@RequestMapping("/getAllCompany")
		public Iterable<Company> getAllCompany() {
			return CompanyRepository.findAll();
		}

		@PostMapping("/saveCompany")
		public Company saveCompany(@RequestBody Company company) {
			System.out.println(company);
			CompanyRepository.save(company);
			return company;
		}

		@PutMapping("/updateCompany/{companyname}")
		public Company updateCompany(@RequestBody Company company, @PathVariable("companyname") String companyname) {
			company.setCompanyname(companyname);
			System.out.println(company);
			CompanyRepository.save(company);
			return company;
		}

		@DeleteMapping("/deletecompany/{companyname}")
		public Boolean deleteCompany( @PathVariable("companyname")String companyname) {
			System.out.println(companyname);
			Optional<Company> company = CompanyRepository.findById(companyname);

			CompanyRepository.delete(company.get());
			return true;
		}
		@GetMapping("/findOneInAll1/{companyname}")
		public Company findoneinall(@PathVariable("companyname") String companyname)
		{
			Optional<Company> company  = CompanyRepository.findById(companyname);

			return company.get();
		}
	}


