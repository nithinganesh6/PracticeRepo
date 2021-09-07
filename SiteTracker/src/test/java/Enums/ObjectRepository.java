package Enums;

public class ObjectRepository {

	public enum Identfier {

		COMPONENT_REFERENCE("xpath#//a[@title='Component Reference']"),
		QUICK_FIND("xpath#//input[@name='Quick Find']"),
		DATATABLE("xpath#//div[@class='slds-tree__item']/span/a/span"),
		EXAMPLE_DROP_ICON("xpath#//input[@name='example']"),
		DROPDOWNVAL("css#lightning-base-combobox-item>span>span"),
		RUNBUTTON("xpath#//button[contains(text(),'Run')]"),
		TABLE_DATA("xpath#//table/tbody/tr[3]");
		

		private final String label;

		Identfier(String label) {
			this.label = label;
		}

		public String getLabel() {
			return label;
		}

	}

}
