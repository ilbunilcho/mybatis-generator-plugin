package sample.model;

import java.io.Serializable;

/**
 * <pre>
 * Table        : genres
 * </pre>
 *
 * @mbg.generated 2019-02-27 17:48:22
 */
public class Genres implements Serializable {
    /**
     * <pre>
     * Table        : genres
     * Column       : GenreId
     * Type         : INTEGER (2000000000)
     * </pre>
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    private Integer genreid;

    /**
     * <pre>
     * Table        : genres
     * Column       : Name
     * Type         : VARCHAR (2000000000)
     * </pre>
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column genres.GenreId
     *
     * @return the value of genres.GenreId
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public Integer getGenreid() {
        return genreid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column genres.GenreId
     *
     * @param genreid the value for genres.GenreId
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public void setGenreid(Integer genreid) {
        this.genreid = genreid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column genres.Name
     *
     * @return the value of genres.Name
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column genres.Name
     *
     * @param name the value for genres.Name
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Genres other = (Genres) that;
        return (this.getGenreid() == null ? other.getGenreid() == null : this.getGenreid().equals(other.getGenreid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGenreid() == null) ? 0 : getGenreid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genres
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", genreid=").append(genreid);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}