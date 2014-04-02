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
public class Comment extends org.jooq.impl.TableImpl<models.public_.tables.records.CommentRecord> {

	private static final long serialVersionUID = -210751125;

	/**
	 * The singleton instance of <code>PUBLIC.COMMENT</code>
	 */
	public static final models.public_.tables.Comment COMMENT = new models.public_.tables.Comment();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<models.public_.tables.records.CommentRecord> getRecordType() {
		return models.public_.tables.records.CommentRecord.class;
	}

	/**
	 * The column <code>PUBLIC.COMMENT.ID</code>. 
	 */
	public final org.jooq.TableField<models.public_.tables.records.CommentRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.COMMENT.FILEID</code>. 
	 */
	public final org.jooq.TableField<models.public_.tables.records.CommentRecord, java.lang.Integer> FILEID = createField("FILEID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.COMMENT.USERID</code>. 
	 */
	public final org.jooq.TableField<models.public_.tables.records.CommentRecord, java.lang.Integer> USERID = createField("USERID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.COMMENT.DATE</code>. 
	 */
	public final org.jooq.TableField<models.public_.tables.records.CommentRecord, java.sql.Timestamp> DATE = createField("DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>PUBLIC.COMMENT.CONTENT</code>. 
	 */
	public final org.jooq.TableField<models.public_.tables.records.CommentRecord, java.lang.String> CONTENT = createField("CONTENT", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this);

	/**
	 * Create a <code>PUBLIC.COMMENT</code> table reference
	 */
	public Comment() {
		super("COMMENT", models.public_.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>PUBLIC.COMMENT</code> table reference
	 */
	public Comment(java.lang.String alias) {
		super(alias, models.public_.Public.PUBLIC, models.public_.tables.Comment.COMMENT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<models.public_.tables.records.CommentRecord, java.lang.Integer> getIdentity() {
		return models.public_.Keys.IDENTITY_COMMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<models.public_.tables.records.CommentRecord> getPrimaryKey() {
		return models.public_.Keys.CONSTRAINT_63;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<models.public_.tables.records.CommentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<models.public_.tables.records.CommentRecord>>asList(models.public_.Keys.CONSTRAINT_63);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public models.public_.tables.Comment as(java.lang.String alias) {
		return new models.public_.tables.Comment(alias);
	}
}