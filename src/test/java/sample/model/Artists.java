package sample.model;

import java.io.Serializable;

/**
 * <pre>
 * Table        : artists
 * </pre>
 *
 * @mbg.generated 2019-02-27 17:48:22
 */
public class Artists implements Serializable {
    /**
     * <pre>
     * Table        : artists
     * Column       : ArtistId
     * Type         : INTEGER (2000000000)
     * </pre>
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    private Integer artistid;

    /**
     * <pre>
     * Table        : artists
     * Column       : Name
     * Type         : VARCHAR (2000000000)
     * </pre>
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table artists
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column artists.ArtistId
     *
     * @return the value of artists.ArtistId
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public Integer getArtistid() {
        return artistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column artists.ArtistId
     *
     * @param artistid the value for artists.ArtistId
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public void setArtistid(Integer artistid) {
        this.artistid = artistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column artists.Name
     *
     * @return the value of artists.Name
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column artists.Name
     *
     * @param name the value for artists.Name
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artists
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
        Artists other = (Artists) that;
        return (this.getArtistid() == null ? other.getArtistid() == null : this.getArtistid().equals(other.getArtistid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artists
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArtistid() == null) ? 0 : getArtistid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artists
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", artistid=").append(artistid);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}