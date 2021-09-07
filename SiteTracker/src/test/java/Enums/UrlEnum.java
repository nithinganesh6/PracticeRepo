package Enums;

public class UrlEnum {

	public enum urls {
		BASE_URL("https://developer.salesforce.com/docs/component-library/documentation/en/48.0/lwc");

		private final String label;

		urls(String label) {
			this.label = label;
		}

		public String getLabel() {
			return label;
		}

	}

}
