package model
{
	[Bindable]
	[RemoteClass(alias="com.mariojunior.amfrestfull.model.Person")]
	public class Person
	{
		public var id			: int;
		public var firstName	: String;
		public var twitter		: String;
		public var age			: int;
		public var included		: Date = new Date();
		
	}
}