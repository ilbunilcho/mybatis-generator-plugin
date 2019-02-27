package sample.model;

import java.io.Serializable;

/**
 * <pre>
 * Table        : playlist_track
 * </pre>
 *
 * @mbg.generated 2019-02-27 17:48:22
 */
public class PlaylistTrack implements Serializable {
    /**
     * <pre>
     * Table        : playlist_track
     * Column       : PlaylistId
     * Type         : INTEGER (2000000000)
     * </pre>
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    private Integer playlistid;

    /**
     * <pre>
     * Table        : playlist_track
     * Column       : TrackId
     * Type         : INTEGER (2000000000)
     * </pre>
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    private Integer trackid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table playlist_track
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playlist_track.PlaylistId
     *
     * @return the value of playlist_track.PlaylistId
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public Integer getPlaylistid() {
        return playlistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playlist_track.PlaylistId
     *
     * @param playlistid the value for playlist_track.PlaylistId
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public void setPlaylistid(Integer playlistid) {
        this.playlistid = playlistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playlist_track.TrackId
     *
     * @return the value of playlist_track.TrackId
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public Integer getTrackid() {
        return trackid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playlist_track.TrackId
     *
     * @param trackid the value for playlist_track.TrackId
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    public void setTrackid(Integer trackid) {
        this.trackid = trackid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_track
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
        PlaylistTrack other = (PlaylistTrack) that;
        return (this.getPlaylistid() == null ? other.getPlaylistid() == null : this.getPlaylistid().equals(other.getPlaylistid()))
            && (this.getTrackid() == null ? other.getTrackid() == null : this.getTrackid().equals(other.getTrackid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_track
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlaylistid() == null) ? 0 : getPlaylistid().hashCode());
        result = prime * result + ((getTrackid() == null) ? 0 : getTrackid().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_track
     *
     * @mbg.generated 2019-02-27 17:48:22
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", playlistid=").append(playlistid);
        sb.append(", trackid=").append(trackid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}