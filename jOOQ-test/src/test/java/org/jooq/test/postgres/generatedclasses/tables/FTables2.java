/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FTables2 extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.FTables2Record> {

	private static final long serialVersionUID = -572494068;

	/**
	 * The singleton instance of <code>public.f_tables2</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.FTables2 F_TABLES2 = new org.jooq.test.postgres.generatedclasses.tables.FTables2();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.FTables2Record> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.FTables2Record.class;
	}

	/**
	 * The column <code>public.f_tables2.column_value</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.FTables2Record, java.lang.Long> COLUMN_VALUE = createField("column_value", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.f_tables2</code> table reference
	 */
	public FTables2() {
		this("f_tables2", null);
	}

	/**
	 * Create an aliased <code>public.f_tables2</code> table reference
	 */
	public FTables2(java.lang.String alias) {
		this(alias, org.jooq.test.postgres.generatedclasses.tables.FTables2.F_TABLES2);
	}

	private FTables2(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.FTables2Record> aliased) {
		this(alias, aliased, null);
	}

	private FTables2(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.FTables2Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.FTables2 as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.FTables2(alias, this, parameters);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.postgres.generatedclasses.tables.FTables2 rename(java.lang.String name) {
		return new org.jooq.test.postgres.generatedclasses.tables.FTables2(name, null, parameters);
	}

	/**
	 * Call this table-valued function
	 */
	public org.jooq.test.postgres.generatedclasses.tables.FTables2 call() {
		return new org.jooq.test.postgres.generatedclasses.tables.FTables2(getName(), null, new org.jooq.Field[] {  });
	}
}