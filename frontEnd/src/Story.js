import React from "react";
import "./Story.css";
import { Avatar } from "@material-ui/core";
import { makeStyles } from "@material-ui/core/styles";

const useStyles = makeStyles((theme) => ({
  root: {
    display: "flex",
    "& > *": {
      margin: theme.spacing(1),
    },
  },

  large: {
    width: theme.spacing(8),
    height: theme.spacing(8),
  },

 
}));

function Story() {
  const classes = useStyles();

  return (
    <div className="story">
      <div className="story__item">
        <Avatar
          className="avatar"
          alt="subhampreet"
          src=""
          className={classes.large}
        />
        <h6>Ayurveda</h6>
      </div>

      <div className="story__item">
        <Avatar
          className="avatar"
          alt="subhampreet"
          src=""
          className={classes.large}
        />
        <h6>PMAY</h6>
      </div>

      <div className="story__item">
        <Avatar
          className="avatar"
          alt="subhampreet"
          src=""
          className={classes.large}
        />
        <h6>Medicine</h6>
      </div>

      <div className="story__item">
        <Avatar
          className="avatar"
          alt="subhampreet"
          src=""
          className={classes.large}
        />
        <h6>Water</h6>
      </div>

      <div className="story__item">
        <Avatar
          className="avatar"
          alt="subhampreet"
          src=""
          className={classes.large}
        />
        <h6>Electricity</h6>
      </div>

      <div className="story__item">
        <Avatar
          className="avatar"
          alt="subhampreet"
          src=""
          className={classes.large}
        />
        <h6>PMI</h6>
      </div>
    </div>
  );
}

export default Story;
