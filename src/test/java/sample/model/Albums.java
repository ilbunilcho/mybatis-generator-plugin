package sample.model;

import java.io.Serializable;

/**
 * <pre>
 * Table        : albums
 * </pre>
 *
 * @mbg.generated 2019-02-27 17:48:22
 */
public class Albums implements Serializable {
    /**
     * <pre>
     * Table        : albums
     * Column       : AlbumId
     * Type         : INTEGER (2000000000)
     * </pre>
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    private Integer albumid;

    /**
     * <pre>
     * Table        : albums
     * Column       : Title
     * Type         : VARCHAR (2000000000)
     * </pre>
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    private String title;

    /**
     * <pre>
     * Table        : albums
     * Column       : ArtistId
     * Type         : INTEGER (2000000000)
     * </pre>
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    private Integer artistid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column albums.AlbumId
     *
     * @return the value of albums.AlbumId
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public Integer getAlbumid() {
        return albumid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column albums.AlbumId
     *
     * @param albumid the value for albums.AlbumId
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public void setAlbumid(Integer albumid) {
        this.albumid = albumid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column albums.Title
     *
     * @return the value of albums.Title
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column albums.Title
     *
     * @param title the value for albums.Title
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column albums.ArtistId
     *
     * @return the value of albums.ArtistId
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public Integer getArtistid() {
        return artistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column albums.ArtistId
     *
     * @param artistid the value for albums.ArtistId
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public void setArtistid(Integer artistid) {
        this.artistid = artistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
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
        Albums other = (Albums) that;
        return (this.getAlbumid() == null ? other.getAlbumid() == null : this.getAlbumid().equals(other.getAlbumid()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getArtistid() == null ? other.getArtistid() == null : this.getArtistid().equals(other.getArtistid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAlbumid() == null) ? 0 : getAlbumid().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getArtistid() == null) ? 0 : getArtistid().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table albums
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", albumid=").append(albumid);
        sb.append(", title=").append(title);
        sb.append(", artistid=").append(artistid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}