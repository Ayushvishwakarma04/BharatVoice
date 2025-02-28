import React from "react";
import "./Suggested.css";
import { Avatar, Button } from "@material-ui/core";
import { makeStyles } from "@material-ui/core/styles";
import InstagramIcon from "@material-ui/icons/Instagram";

const useStyles = makeStyles((theme) => ({
  root: {
    display: "flex",
    "& > *": {
      margin: theme.spacing(1),
    },
  },

  large: {
    width: theme.spacing(6.0),
    height: theme.spacing(6.0),
  },
}));

function Suggested() {
  const classes = useStyles();

  return (
    <div className="suggested">

    

  
      <h4>
        {" "}
        Suggestions For You
      </h4>
      <p>
      Here are some schemes curated <b><i>"Just for You"</i></b>{" "}
      </p>

      <div className="footer">
        <Avatar
          className="avatar"
          alt="#"
          src=""
          className={classes.large}
        />

        <div className="footer_content">
          <h5>Scheme1</h5>
        </div>
        <a href="#">
          <Button
            size="small"
            //   variant="contained"
            color="primary"
            className="footer_follow"
          >
            Apply
          </Button>
        </a>
      </div>

      <div className="footer">
        <Avatar
          className="avatar"
          alt="#"
          src=""
          className={classes.large}
        />

        <div className="footer_content">
          <h5>Scheme2</h5>
        </div>
        <a href="#">
          <Button
            size="small"
            //   variant="contained"
            color="primary"
            className="footer_follow"
          >
            Apply
          </Button>
        </a>
      </div>

      <div className="footer">
        <Avatar
          className="avatar"
          alt="#"
          src=""
          className={classes.large}
        />

        <div className="footer_content">
          <h5>Scheme3</h5>
        </div>
        <a href="#">
          <Button
            size="small"
            //   variant="contained"
            color="primary"
            className="footer_follow"
          >
            Apply
          </Button>
        </a>
      </div>

      <div className="footer">
        <Avatar
          className="avatar"
          alt="#"
          src=""
          className={classes.large}
        />

        <div className="footer_content">
          <h5>Scheme4</h5>
        </div>
        <a href="#">
          <Button
            size="small"
            
            color="primary"
            className="footer_follow"
          >
            Apply
          </Button>
        </a>
      </div>

      <div className="footer">
        <Avatar
          className="avatar"
          alt="#"
          src=""
          className={classes.large}
        />

        <div className="footer_content">
          <h5>Scheme5</h5>
        </div>
        <a href="#">
          <Button
            size="small"
            
            color="primary"
            className="footer_follow"
          >
            Apply
          </Button>
        </a>
      </div>


      <div className="footer">
        <Avatar
          className="avatar"
          alt="#"
          src=""
          className={classes.large}
        />

        <div className="footer_content">
          <h5>Scheme6</h5>
        </div>
        <a href="#">
          <Button
            size="small"
            
            color="primary"
            className="footer_follow"
          >
            Apply
          </Button>
        </a>
      </div>

      <a href="#">
          <Button
            size="small"
            
            color="primary"
            className="footer_follow_main"
          >
            See All
          </Button>
    </a>


    </div>
  );
}

export default Suggested;
