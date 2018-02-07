package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUsersOverviewPage {

	WebDriver driver;

	// Colleges tab
	By colleges = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.main-items.clearfix.navbar > ul > li:nth-child(1) > a");

	// User tab
	By users = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.main-items.clearfix.navbar > ul > li.clickable.ng-scope.active > a");

	// High school tab
	By highSchools = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.main-items.clearfix.navbar > ul > li:nth-child(3) > a");

	// Communications tab
	By communications = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.main-items.clearfix.navbar > ul > li:nth-child(4) > a");

	// Challenges tab
	By challenges = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.main-items.clearfix.navbar > ul > li:nth-child(5) > a");

	// Overview tab
	By overview = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.cockpit.hidden-xs.clearfix.ng-scope > ul > li:nth-child(1) > a");

	// Students tab
	By students = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.cockpit.hidden-xs.clearfix.ng-scope > ul > li:nth-child(2) > a");

	// Parents tab
	By parents = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.cockpit.hidden-xs.clearfix.ng-scope > ul > li:nth-child(3) > a");

	// Counselors tab
	By counselors = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.cockpit.hidden-xs.clearfix.ng-scope > ul > li:nth-child(4) > a");

	// Teachers tab
	By teachers = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.cockpit.hidden-xs.clearfix.ng-scope > ul > li:nth-child(5) > a");

	// Admission officers tab
	By admissionOfficers = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.cockpit.hidden-xs.clearfix.ng-scope > ul > li:nth-child(6) > a");

	// Scoir tab
	By scoir = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.cockpit.hidden-xs.clearfix.ng-scope > ul > li:nth-child(7) > a");

	// Admins tab
	By admin = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.cockpit.hidden-xs.clearfix.ng-scope > ul > li:nth-child(8) > a");

	// Registered users student box
	By studentBox = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > user-tiles > div > div:nth-child(1) > user-type-tile > div > p.tile-type-value > a");

	// Registered users parents box
	By parentBox = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > user-tiles > div > div:nth-child(2) > user-type-tile > div > p.tile-type-value > a");

	// Registered users counselors box
	By counselorBox = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > user-tiles > div > div:nth-child(3) > user-type-tile > div > p.tile-type-value > a");

	// Registered users teachers box
	By teacherBox = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > user-tiles > div > div:nth-child(4) > user-type-tile > div > p.tile-type-value > a");

	// Registered users admissions box
	By adminBox = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > user-tiles > div > div:nth-child(5) > user-type-tile > div > p.tile-type-value > a");

	// Onboarding by type student total
	By studentsTotal = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > a");

	// Onboarding by type student Registered
	By studentsReg = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(2) > td:nth-child(3) > a");

	// Onboarding by type student not registered
	By studentsNReg = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(2) > td:nth-child(5) > a");

	// Onboarding by type student not invited
	By studentsNInvited = By.cssSelector("");

	// Onboarding by type student bounced
	By studentsBounced = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(2) > td:nth-child(7) > a");

	// Onboarding by type parents total
	By parentsTotal = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(3) > td:nth-child(2) > a");

	// Onboarding by type parents registered
	By parentsReg = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(3) > td:nth-child(3) > a");

	// Onboarding by type parents not registered
	By parentsNReg = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(3) > td:nth-child(5) > a");

	// Onboarding by type parents not Invited
	By parentsNInvited = By.cssSelector("");

	// Onboarding by type parents Bounced
	By parentsBounced = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(3) > td:nth-child(7) > a");

	// Onboarding by type counselors total
	By counselorsTotal = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(4) > td:nth-child(2) > a");

	// Onboarding by type counselors registered
	By counselorsReg = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(4) > td:nth-child(3) > a");

	// Onboarding by type counselors not registered
	By counselorsNReg = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(4) > td:nth-child(5) > a");

	// Onboarding by type counselors not invited
	By counselorsNInvited = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(4) > td:nth-child(6) > a");

	// Onboarding by type counselors bounced
	By counselorsBounced = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(4) > td:nth-child(7) > a");

	// Onboarding by type teachers total
	By teachersTotal = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(5) > td:nth-child(2) > a");

	// Onboarding by type teachers registered
	By teachersReg = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(5) > td:nth-child(3) > a");

	// Onboarding by type teachers not registered
	By teachersNReg = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(5) > td:nth-child(5) > a");

	// Onboarding by type teachers not invited
	By teachersNInvited = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(5) > td:nth-child(6) > a");

	// Onboarding by type teachers bounced
	By teachersBounced = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(5) > td:nth-child(7) > a");

	// Onboarding by type admins total
	By adminsTotal = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(6) > td:nth-child(2) > a");

	// Onboarding by type admins registered
	By adminsReg = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(6) > td:nth-child(3) > a");

	// Onboarding by type admins not registered
	By adminsNReg = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(6) > td:nth-child(5) > a");

	// Onboarding by type admins not invited
	By adminsNInvited = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(6) > td:nth-child(6) > a");

	// Onboarding by type admins bounced
	By adminsBounced = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div.col-lg-5 > div:nth-child(1) > onboarding-by-type > div > table > tbody > tr:nth-child(6) > td:nth-child(7) > a");

	// Home button
	By scoirHome = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.jumbotron > a > img");

	// User dropdown menu
	By userDrop = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.jumbotron > div > ul > li.dropdown.account > div > span.username.ng-binding");

	// Active feature control
	By activeFeature = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.jumbotron > div > ul > li.dropdown.account.open > ul > li.noticebar-menu-item.ng-scope > a");

	// Sign out
	By signOut = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.stacked-navigation.ng-isolate-scope.large > div > div.jumbotron > div > ul > li.dropdown.account.open > ul > li:nth-child(2) > a");

	public AdminUsersOverviewPage(WebDriver driver) {

		this.driver = driver;

	}

	public void clickColleges() {

		driver.findElement(colleges).click();

	}

	public void clickUsers() {

		driver.findElement(users).click();

	}

	public void clickHighSchools() {

		driver.findElement(highSchools).click();

	}

	public void clickCommunications() {

		driver.findElement(communications).click();

	}

	public void clickchallenges() {

		driver.findElement(challenges).click();

	}

	public void clickOverview() {

		driver.findElement(overview).click();

	}

	public void clickStudents() {

		driver.findElement(students).click();

	}

	public void clickParents() {

		driver.findElement(parents).click();

	}

	public void clickCounselors() {

		driver.findElement(counselors).click();

	}

	public void clickTeachers() {

		driver.findElement(teachers).click();

	}

	public void clickAdmissionOfficers() {

		driver.findElement(admissionOfficers).click();

	}

	public void clickScoir() {

		driver.findElement(scoir).click();

	}

	public void clickAdmin() {

		driver.findElement(admin).click();

	}

	public void clickStudentBox() {

		driver.findElement(studentBox).click();

	}

	public void clickParentBox() {

		driver.findElement(parentBox).click();

	}

	public void clickCounselorBox() {

		driver.findElement(counselorBox).click();

	}

	public void clickTeacherBox() {

		driver.findElement(teacherBox).click();

	}

	public void clickAdminBox() {

		driver.findElement(adminBox).click();

	}

	public void clickStudentsTotal() {

		driver.findElement(studentsTotal).click();

	}

	public void clickStudentsReg() {

		driver.findElement(studentsReg).click();

	}

	public void clickStudentsNReg() {

		driver.findElement(studentsNReg).click();

	}

	public void clickStudentsNInvited() {

		driver.findElement(studentsNInvited).click();

	}

	public void clickStudentsBounced() {

		driver.findElement(studentsBounced).click();

	}

	public void clickParentsTotal() {

		driver.findElement(parentsTotal).click();

	}

	public void clickParentsReg() {

		driver.findElement(parentsReg).click();

	}

	public void clickParentsNReg() {

		driver.findElement(parentsNReg).click();

	}

	public void clickParentsNInvited() {

		driver.findElement(parentsNInvited).click();

	}

	public void clickParentsBounced() {

		driver.findElement(parentsBounced).click();

	}

	public void clickCounselorsTotal() {

		driver.findElement(counselorsTotal).click();

	}

	public void clickCounselorsReg() {

		driver.findElement(counselorsReg).click();

	}

	public void clickCounselorsNReg() {

		driver.findElement(counselorsNReg).click();

	}

	public void clickCounselorsNInvited() {

		driver.findElement(counselorsNInvited).click();

	}

	public void clickCounselorsBounced() {

		driver.findElement(counselorsBounced).click();

	}

	public void clickTeachersTotal() {

		driver.findElement(teachersTotal).click();

	}

	public void clickTeacherssReg() {

		driver.findElement(teachersReg).click();

	}

	public void clickTeachersNReg() {

		driver.findElement(teachersNReg).click();

	}

	public void clickTeachersNInvited() {

		driver.findElement(teachersNInvited).click();

	}

	public void clickTeachersBounced() {

		driver.findElement(teachersBounced).click();

	}

	public void clickAdminsTotal() {

		driver.findElement(adminsTotal).click();

	}

	public void clickAdminsReg() {

		driver.findElement(adminsReg).click();

	}

	public void clickAdminsNReg() {

		driver.findElement(adminsNReg).click();

	}

	public void clickAdminsNInvited() {

		driver.findElement(adminsNInvited).click();

	}

	public void clickAdminsBounced() {

		driver.findElement(adminsBounced).click();

	}

	public void clickScoirHome() {

		driver.findElement(scoirHome).click();

	}

	public void clickUserDrop() {

		driver.findElement(userDrop).click();

	}

	public void clickActiveFeature() {

		driver.findElement(activeFeature).click();

	}

	public void clickSignOut() {

		driver.findElement(signOut).click();

	}

}
