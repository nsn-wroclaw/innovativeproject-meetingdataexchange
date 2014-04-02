/**
 * This class is generated by jOOQ
 */
package models.public_.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class File extends org.jooq.impl.TableImpl<models.public_.tables.records.FileRecord> {

	private static final long serialVersionUID = 159880290;

	/**
	 * The singleton instance of <code>PUBLIC.FILE</code>
	 */
	public static final models.public_.tables.File FILE = new models.public_.tables.File();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<models.public_.tables.records.FileRecord> getRecordType() {
		return models.public_.tables.records.FileRecord.class;
	}

	/**
	 * The column <code>PUBLIC.FILE.ID</code>. 
	 */
	public final org.jooq.TableField<models.public_.tables.records.FileRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.FILE.MEETINGUSERID</code>. 
	 */
	public final org.jooq.TableField<models.public_.tables.records.FileRecord, java.lang.Integer> MEETINGUSERID = createField("MEETINGUSERID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.FILE.NAME</code>. 
	 */
	public final org.jooq.TableField<models.public_.tables.records.FileRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.FILE.TYPEFILEID</code>. 
	 */
	public final org.jooq.TableField<models.public_.tables.records.FileRecord, java.lang.Integer> TYPEFILEID = createField("TYPEFILEID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.FILE.SIZE</code>. 
	 */
	public final org.jooq.TableField<models.public_.tables.records.FileRecord, java.lang.Integer> SIZE = createField("SIZE", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.FILE.ADDEDTIE</code>. 
	 */
	public final org.jooq.TableField<models.public_.tables.records.FileRecord, java.sql.Timestamp> ADDEDTIE = createField("ADDEDTIE", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>PUBLIC.FILE</code> table reference
	 */
	public File() {
		super("FILE", models.public_.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>PUBLIC.FILE</code> table reference
	 */
	public File(java.lang.String alias) {
		super(alias, models.public_.Public.PUBLIC, models.public_.tables.File.FILE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<models.public_.tables.records.FileRecord, java.lang.Integer> getIdentity() {
		return models.public_.Keys.IDENTITY_FILE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<models.public_.tables.records.FileRecord> getPrimaryKey() {
		return models.public_.Keys.CONSTRAINT_20;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<models.public_.tables.records.FileRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<models.public_.tables.records.FileRecord>>asList(models.public_.Keys.CONSTRAINT_20);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public models.public_.tables.File as(java.lang.String alias) {
		return new models.public_.tables.File(alias);
	}
}